<b>Examples</b>

<b>Example 1</b>

Request: GET /code

Response: 

<img src = "https://user-images.githubusercontent.com/92060452/198155253-5d09a197-a838-41a2-b4df-a88ebb041768.jpg" width = "517"/>


<b>Example 2</b>

Request: GET /api/code

Response:

<pre>{
    "code": "public static void ...",
    "date": "2020/01/01 12:00:03"
}
</pre>
<b>Example 3</b>

Request: POST /api/code/new with the following body:
<pre>
{
    "code": "class Code { ..."
}
</pre>
Response: {}.

After that, GET /code should contain an updated snippet with an updated date:

<img src= "https://user-images.githubusercontent.com/92060452/198155402-5bac810a-7f00-4823-9d70-062f891e7b33.jpg" width = "517"/>

<b>Example 4</b>

Request: GET /code/new

Response:

<img src = "https://user-images.githubusercontent.com/92060452/198155425-e89d7536-850a-403f-b9e1-c56fa9082c9f.jpg" width = "517"/>


