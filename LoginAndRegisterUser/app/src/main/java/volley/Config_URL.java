package volley;

//This class is for storing all URLs as a model of URLs

public class Config_URL
{
	private static String base_URL = "http://10.0.2.2:80/";		//Default configuration for WAMP - 80 is default port for WAMP and 10.0.2.2 is localhost IP in Android Emulator
	// Server user login url
	public static String URL_LOGIN = base_URL+"android_login_api/";

	// Server user register url
	public static String URL_REGISTER = base_URL+"android_login_api/";
/*
	private static final String URL_JSON_OBJECT = "http://api.androidhive.info/volley/person_object.json";
	private static final String URL_JSON_ARRAY = "http://api.androidhive.info/volley/person_array.json";
	private static final String URL_STRING_REQ = "http://api.androidhive.info/volley/string_response.html";
	private static final String URL_IMAGE = "http://api.androidhive.info/volley/volley-image.jpg";

	//If you need any parameter passed with the URL (GET) - U need to modify this functions
	public static String get_JSON_Object_URL()
	{
		return URL_JSON_OBJECT;
	}

	public static String get_JSON_Array_URL()
	{
		return URL_JSON_ARRAY;
	}

	public static String get_String_URL(String Input)
	{
		if(Input.length()>0) {
			return Input;
		}
		return URL_STRING_REQ;
	}

	public static String get_Image_URL()
	{
		return URL_IMAGE;
	}
	*/
}
