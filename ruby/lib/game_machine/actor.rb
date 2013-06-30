module GameMachine

  class DuplicateHashringError < StandardError;end
  class MissingHashringError < StandardError;end

  class Actor < JavaLib::UntypedActor

    class << self
      alias_method :apply, :new
      alias_method :create, :new

      def components
        @components ||= []
      end

      def register_component(component)
        components << component
        GameMachine.logger.debug "Component #{component} registered to #{self.name}"
      end

      def reset_hashrings
        @@hashrings = nil
      end

      def hashrings
        @@hashrings ||= java.util.concurrent.ConcurrentHashMap.new
      end

      def hashring(name)
        hashrings.fetch(name,nil)
      end

      def add_hashring(name,hashring)
        if hashring(name)
          raise DuplicateHashringError, "name=#{name}"
        end
        hashrings[name] = hashring
      end

      def find(name=self.name)
        ActorRef.new(local_path(name))
      end

      def find_remote(server,name=self.name)
        ActorRef.new(remote_path(server,name))
      end

      def find_distributed(id,name=self.name)
        if hashring(name)
          ActorRef.new(distributed_path(id, name))
        else
          raise MissingHashringError
        end
      end

      def remote_path(server,name)
        "#{Server.address_for(server)}/user/#{name}"
      end

      def distributed_path(id,name)
        server = Server.instance.hashring.bucket_for(id)
        bucket = hashring(name).bucket_for(id)
        "#{server}/user/#{bucket}"
      end

      def local_path(name)
        "/user/#{name}"
      end
    end

    def onReceive(message)
      on_receive(message)
    end

    def on_receive(message)
      unhandled(message)
    end

  end
end
