module GameMachine
  module GameSystems
    class Devnull < Actor::Base
      
      def post_init(*args)
      end

      def on_receive(message)
        GameMachine.logger.debug("Devnull got #{message}")
      end
    end
  end
end
