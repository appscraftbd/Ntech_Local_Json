# Ntech_Local_Json
<img src="https://raw.githubusercontent.com/appscraftbd/appscraftbd/main/github.png">
<h2>Parse local JSON file in Android</h2>
Step 1. Create Assets Folder And upload your .json File or create json file<br>
Step 2. Add the JitPack repository to your build file 

	
			maven { url 'https://jitpack.io' }
   


Step 3. Add the dependency
```
	dependencies {
	        implementation 'com.github.appscraftbd:Ntech_Local_Json:2.0.1'
	}
```
Step 4. Library Java code

```
	Localjson localjson = new Localjson();
        String j_response = localjson.loadJSONFromAsset(this,"Your_jsonFile.json");

//      try {
//          JSONObject jsonObject = new JSONObject(j_response);
//                String name = jsonObject.getString("name");
//                String number = jsonObject.getString("number");
//                //
//                //
//                //
//                //
//                //others
//
//        } catch (JSONException e) {
//            throw new RuntimeException(e);
//        }

//////////////////////// or //////////////////

//        try {
//            JSONArray jsonArray = new JSONArray(j_response);
//
//            for (int i=0; i<jsonArray.length(); i++) {
//                
//                JSONObject jsonObject = jsonArray.getJSONObject(i);
//                String name = jsonObject.getString("name");
//                String number = jsonObject.getString("number");
//                //
//                //
//                //
//                //
//                //others
//
//            }
//        } catch (JSONException e) {
//            throw new RuntimeException(e);
//        }




///////যে ভাবে  JSONArray , JSONObject লিখতে হয় ঠিক একই ভাবে লিখতে হবে।///////
        


```

