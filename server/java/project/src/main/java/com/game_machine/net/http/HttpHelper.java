package com.game_machine.net.http;

// Bridge to call into ruby
public interface HttpHelper {
	String client_auth_response(String authtoken);
	String clusterinfo();
}
