
package com.game_machine.entity_system.generated;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

import com.dyuproject.protostuff.ByteString;
import com.dyuproject.protostuff.GraphIOUtil;
import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Output;

import java.io.ByteArrayOutputStream;
import com.dyuproject.protostuff.JsonIOUtil;
import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.ProtobufIOUtil;
import com.dyuproject.protostuff.ProtostuffIOUtil;
import com.dyuproject.protostuff.runtime.RuntimeSchema;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.game_machine.entity_system.Entities;
import com.game_machine.entity_system.generated.Entity;
import com.game_machine.entity_system.Component;

import com.dyuproject.protostuff.Pipe;
import com.dyuproject.protostuff.Schema;
import com.dyuproject.protostuff.UninitializedMessageException;

public final class Components extends com.game_machine.entity_system.Component implements Externalizable, Message<Components>, Schema<Components>
{



    public static Schema<Components> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static Components getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final Components DEFAULT_INSTANCE = new Components();

    private List<Player> player;
    private List<PlayersAroundMe> playersAroundMe;
    private List<GameCommand> gameCommand;
    private List<ClientConnection> clientConnection;
    private List<ChatMessage> chatMessage;
    

    public Components()
    {
        
    }

	public List<Player> getPlayerList() {
		return player;
	}

	public Components setPlayerList(List<Player> player) {
		this.player = player;
		return this;
	}

	public Player getPlayer(int index)  {
        return player == null ? null : player.get(index);
    }

    public int getPlayerCount()  {
        return player == null ? 0 : player.size();
    }

    public Components addPlayer(Player player)  {
        if(this.player == null)
            this.player = new ArrayList<Player>();
        this.player.add(player);
        return this;
    }
    
	public List<PlayersAroundMe> getPlayersAroundMeList() {
		return playersAroundMe;
	}

	public Components setPlayersAroundMeList(List<PlayersAroundMe> playersAroundMe) {
		this.playersAroundMe = playersAroundMe;
		return this;
	}

	public PlayersAroundMe getPlayersAroundMe(int index)  {
        return playersAroundMe == null ? null : playersAroundMe.get(index);
    }

    public int getPlayersAroundMeCount()  {
        return playersAroundMe == null ? 0 : playersAroundMe.size();
    }

    public Components addPlayersAroundMe(PlayersAroundMe playersAroundMe)  {
        if(this.playersAroundMe == null)
            this.playersAroundMe = new ArrayList<PlayersAroundMe>();
        this.playersAroundMe.add(playersAroundMe);
        return this;
    }
    
	public List<GameCommand> getGameCommandList() {
		return gameCommand;
	}

	public Components setGameCommandList(List<GameCommand> gameCommand) {
		this.gameCommand = gameCommand;
		return this;
	}

	public GameCommand getGameCommand(int index)  {
        return gameCommand == null ? null : gameCommand.get(index);
    }

    public int getGameCommandCount()  {
        return gameCommand == null ? 0 : gameCommand.size();
    }

    public Components addGameCommand(GameCommand gameCommand)  {
        if(this.gameCommand == null)
            this.gameCommand = new ArrayList<GameCommand>();
        this.gameCommand.add(gameCommand);
        return this;
    }
    
	public List<ClientConnection> getClientConnectionList() {
		return clientConnection;
	}

	public Components setClientConnectionList(List<ClientConnection> clientConnection) {
		this.clientConnection = clientConnection;
		return this;
	}

	public ClientConnection getClientConnection(int index)  {
        return clientConnection == null ? null : clientConnection.get(index);
    }

    public int getClientConnectionCount()  {
        return clientConnection == null ? 0 : clientConnection.size();
    }

    public Components addClientConnection(ClientConnection clientConnection)  {
        if(this.clientConnection == null)
            this.clientConnection = new ArrayList<ClientConnection>();
        this.clientConnection.add(clientConnection);
        return this;
    }
    
	public List<ChatMessage> getChatMessageList() {
		return chatMessage;
	}

	public Components setChatMessageList(List<ChatMessage> chatMessage) {
		this.chatMessage = chatMessage;
		return this;
	}

	public ChatMessage getChatMessage(int index)  {
        return chatMessage == null ? null : chatMessage.get(index);
    }

    public int getChatMessageCount()  {
        return chatMessage == null ? 0 : chatMessage.size();
    }

    public Components addChatMessage(ChatMessage chatMessage)  {
        if(this.chatMessage == null)
            this.chatMessage = new ArrayList<ChatMessage>();
        this.chatMessage.add(chatMessage);
        return this;
    }
    

  
    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<Components> cachedSchema()
    {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public Components newMessage()
    {
        return new Components();
    }

    public Class<Components> typeClass()
    {
        return Components.class;
    }

    public String messageName()
    {
        return Components.class.getSimpleName();
    }

    public String messageFullName()
    {
        return Components.class.getName();
    }

    public boolean isInitialized(Components message)
    {
        return true;
    }

    public void mergeFrom(Input input, Components message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
            	case 1:
            		if(message.player == null)
                        message.player = new ArrayList<Player>();
                    message.player.add(input.mergeObject(null, Player.getSchema()));
                    break;
            	case 2:
            		if(message.playersAroundMe == null)
                        message.playersAroundMe = new ArrayList<PlayersAroundMe>();
                    message.playersAroundMe.add(input.mergeObject(null, PlayersAroundMe.getSchema()));
                    break;
            	case 3:
            		if(message.gameCommand == null)
                        message.gameCommand = new ArrayList<GameCommand>();
                    message.gameCommand.add(input.mergeObject(null, GameCommand.getSchema()));
                    break;
            	case 4:
            		if(message.clientConnection == null)
                        message.clientConnection = new ArrayList<ClientConnection>();
                    message.clientConnection.add(input.mergeObject(null, ClientConnection.getSchema()));
                    break;
            	case 5:
            		if(message.chatMessage == null)
                        message.chatMessage = new ArrayList<ChatMessage>();
                    message.chatMessage.add(input.mergeObject(null, ChatMessage.getSchema()));
                    break;
            
                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, Components message) throws IOException
    {
    	

    	
    	if(message.player != null)
        {
            for(Player player : message.player)
            {
                if(player != null) {
    				output.writeObject(1, player, Player.getSchema(), true);
    			}
            }
        }
    	

    	
    	if(message.playersAroundMe != null)
        {
            for(PlayersAroundMe playersAroundMe : message.playersAroundMe)
            {
                if(playersAroundMe != null) {
    				output.writeObject(2, playersAroundMe, PlayersAroundMe.getSchema(), true);
    			}
            }
        }
    	

    	
    	if(message.gameCommand != null)
        {
            for(GameCommand gameCommand : message.gameCommand)
            {
                if(gameCommand != null) {
    				output.writeObject(3, gameCommand, GameCommand.getSchema(), true);
    			}
            }
        }
    	

    	
    	if(message.clientConnection != null)
        {
            for(ClientConnection clientConnection : message.clientConnection)
            {
                if(clientConnection != null) {
    				output.writeObject(4, clientConnection, ClientConnection.getSchema(), true);
    			}
            }
        }
    	

    	
    	if(message.chatMessage != null)
        {
            for(ChatMessage chatMessage : message.chatMessage)
            {
                if(chatMessage != null) {
    				output.writeObject(5, chatMessage, ChatMessage.getSchema(), true);
    			}
            }
        }
    	
    }

    public String getFieldName(int number)
    {
        switch(number)
        {
        	case 1: return "player";
        	case 2: return "playersAroundMe";
        	case 3: return "gameCommand";
        	case 4: return "clientConnection";
        	case 5: return "chatMessage";
            default: return null;
        }
    }

    public int getFieldNumber(String name)
    {
        final Integer number = __fieldMap.get(name);
        return number == null ? 0 : number.intValue();
    }

    private static final java.util.HashMap<String,Integer> __fieldMap = new java.util.HashMap<String,Integer>();
    static
    {
    	__fieldMap.put("player", 1);
    	__fieldMap.put("playersAroundMe", 2);
    	__fieldMap.put("gameCommand", 3);
    	__fieldMap.put("clientConnection", 4);
    	__fieldMap.put("chatMessage", 5);
    }
   
   public static List<String> getFields() {
	ArrayList<String> fieldNames = new ArrayList<String>();
	String fieldName = null;
	Integer i = 1;
	
    while(true) { 
		fieldName = Components.getSchema().getFieldName(i);
		if (fieldName == null) {
			break;
		}
		fieldNames.add(fieldName);
		i++;
	}
	return fieldNames;
}

public static Components parseFrom(byte[] bytes) {
	Components message = new Components();
	ProtobufIOUtil.mergeFrom(bytes, message, RuntimeSchema.getSchema(Components.class));
	return message;
}

public Components clone() {
	byte[] bytes = this.toByteArray();
	Components components = Components.parseFrom(bytes);
	components.setEntityId(null);
	return components;
}
	
public byte[] toByteArray() {
	if (Entities.encoding.equals("protobuf")) {
		return toProtobuf();
	} else if (Entities.encoding.equals("json")) {
		return toJson();
	} else {
		throw new RuntimeException("No encoding specified");
	}
}

public byte[] toJson() {
	boolean numeric = false;
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	try {
		JsonIOUtil.writeTo(out, this, Components.getSchema(), numeric);
	} catch (IOException e) {
		e.printStackTrace();
		throw new RuntimeException("Json encoding failed");
	}
	return out.toByteArray();
}
		
public byte[] toProtobuf() {
	LinkedBuffer buffer = LinkedBuffer.allocate(1024);
	byte[] bytes = null;

	try {
		bytes = ProtobufIOUtil.toByteArray(this, RuntimeSchema.getSchema(Components.class), buffer);
		buffer.clear();
	} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException("Protobuf encoding failed");
	}
	return bytes;
}

    public Entities toEntities() {
   		Entities entities = new Entities();
   		Entity entity = null;
   		Integer entityId = null;
   		if (this.getPlayerList() != null) {
   			for (Player player : this.getPlayerList()) {
   				entityId = player.getEntityId();
   				if (entityId == null) {
   					continue;
   		 		}
   				if (entities.hasEntity(entityId)) {
   					entities.getEntity(entityId).setPlayer(player);
   				} else {
   					entity = new Entity(entityId);
   					entity.setPlayer(player);
   					entities.addEntity(entity);
   				}
   			}
   		}
   		if (this.getPlayersAroundMeList() != null) {
   			for (PlayersAroundMe playersAroundMe : this.getPlayersAroundMeList()) {
   				entityId = playersAroundMe.getEntityId();
   				if (entityId == null) {
   					continue;
   		 		}
   				if (entities.hasEntity(entityId)) {
   					entities.getEntity(entityId).setPlayersAroundMe(playersAroundMe);
   				} else {
   					entity = new Entity(entityId);
   					entity.setPlayersAroundMe(playersAroundMe);
   					entities.addEntity(entity);
   				}
   			}
   		}
   		if (this.getGameCommandList() != null) {
   			for (GameCommand gameCommand : this.getGameCommandList()) {
   				entityId = gameCommand.getEntityId();
   				if (entityId == null) {
   					continue;
   		 		}
   				if (entities.hasEntity(entityId)) {
   					entities.getEntity(entityId).setGameCommand(gameCommand);
   				} else {
   					entity = new Entity(entityId);
   					entity.setGameCommand(gameCommand);
   					entities.addEntity(entity);
   				}
   			}
   		}
   		if (this.getClientConnectionList() != null) {
   			for (ClientConnection clientConnection : this.getClientConnectionList()) {
   				entityId = clientConnection.getEntityId();
   				if (entityId == null) {
   					continue;
   		 		}
   				if (entities.hasEntity(entityId)) {
   					entities.getEntity(entityId).setClientConnection(clientConnection);
   				} else {
   					entity = new Entity(entityId);
   					entity.setClientConnection(clientConnection);
   					entities.addEntity(entity);
   				}
   			}
   		}
   		if (this.getChatMessageList() != null) {
   			for (ChatMessage chatMessage : this.getChatMessageList()) {
   				entityId = chatMessage.getEntityId();
   				if (entityId == null) {
   					continue;
   		 		}
   				if (entities.hasEntity(entityId)) {
   					entities.getEntity(entityId).setChatMessage(chatMessage);
   				} else {
   					entity = new Entity(entityId);
   					entity.setChatMessage(chatMessage);
   					entities.addEntity(entity);
   				}
   			}
   		}
   		return entities;
	}
    
	public static Components fromEntities(Entities entities) {
		Components components = new Components();
		for (Entity entity : entities.getEntities().values()) {
			if (entity.hasPlayer()) {
				components.addPlayer(entity.getPlayer());
			}
			if (entity.hasPlayersAroundMe()) {
				components.addPlayersAroundMe(entity.getPlayersAroundMe());
			}
			if (entity.hasGameCommand()) {
				components.addGameCommand(entity.getGameCommand());
			}
			if (entity.hasClientConnection()) {
				components.addClientConnection(entity.getClientConnection());
			}
			if (entity.hasChatMessage()) {
				components.addChatMessage(entity.getChatMessage());
			}
		}
		return components;
	}
 
    

}