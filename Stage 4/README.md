<b>Examples</b>

In the following examples, consider that no code snippets have been uploaded beforehand.

<b>Example 1</b>

Request POST /api/code/new with the following body:

<pre>{ "code": "class Code { ..." }</pre>
Response: { "id" : "1" }.

Another request POST /api/code/new with the following body:

<pre>{ "code": "public static void ..." }</pre>
Response: { "id" : "2" }.

<b>Example 2</b>

Request: GET /api/code/1
Response:
<pre>
{
    "code": "class Code { ...",
    "date": "2020/05/05 11:59:12"
}</pre>
<b>Example 3</b>

Request: GET /api/code/2
Response:
<pre>
{
    "code": "public static void ...",
    "date": "2020/05/05 12:00:43"
}</pre>
<b>Example 4</b>

Request: GET /api/code/latest
Response:
<pre>
[
    {
        "code": "public static void ...",
        "date": "2020/05/05 12:00:43"
    },
    {
        "code": "class Code { ...",
        "date": "2020/05/05 11:59:12"
    }
]</pre>
<b>Example 5</b>

Request: GET /code/latest
Response:

<img src = "https://user-images.githubusercontent.com/92060452/198755422-27ace15b-9520-41af-af60-07f2d043a7e1.png" width = "517"/>
