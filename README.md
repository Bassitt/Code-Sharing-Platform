# Code-Sharing-Platform
There is a lot of collaboration in programming: many projects require sharing your code with other developers. Using open web resources such as Pastebin is not always an option. In this project, you will create your own secure version of a code-sharing platform.

<b>Examples</b>
In the following examples, consider that no code snippets have been uploaded beforehand.

<b>Example 1</b>

Request POST /api/code/new with the following body:
<pre>
{
    "code": "class Code { ...",
    "time": 0,
    "views": 0
}</pre>
Response: { "id" : "7dc53df5-703e-49b3-8670-b1c468f47f1f" }.

Request POST /api/code/new with the following body:
<pre>
{
    "code": "public static void ...",
    "time": 0,
    "views": 0
}</pre>
Response: { "id" : "e6780274-c41c-4ab4-bde6-b32c18b4c489" }.

Request POST /api/code/new with the following body:
<pre>
{
    "code": "Secret code",
    "time": 5000,
    "views": 5
}</pre>
Response: { "id" : "2187c46e-03ba-4b3a-828b-963466ea348c" }.

<b>Example 2</b>

Request: GET /api/code/2187c46e-03ba-4b3a-828b-963466ea348c

Response:
<pre>
{
    "code": "Secret code",
    "date": "2022/10/30 12:01:45",
    "time": 4995,
    "views": 4
}</pre>
Another request GET /api/code/2187c46e-03ba-4b3a-828b-963466ea348c

Response:
<pre>
{
    "code": "Secret code",
    "date": "2022/10/30 12:01:45",
    "time": 4991,
    "views": 3
}</pre>
<b>Example 3</b>

Request: GET /code/af44277f-b0f4-4048-91c3-bcd8e2a8d051

Response:

<img src = "https://user-images.githubusercontent.com/92060452/198856452-14dd491c-ee98-4282-a4a2-a58bca746b9f.png" height="349" width = "629"/>



Example 4

Request: GET /api/code/latest

Response:
<pre>
[
    {
        "code": "public static void ...",
        "date": "2022/10/30 01:38:09",
        "time": 0,
        "views": 0
    },
    {
        "code": "class Code { ...",
        "date": "2022/10/30 01:37:53",
        "time": 0,
        "views": 0
    }
]</pre>
<b>Example 5</b>

Request: GET /code/latest

Response:

<img src = "https://user-images.githubusercontent.com/92060452/198856344-d3d0e879-b4a6-4679-bd52-0732e7973377.png" height="349" width = "429"/>



<b>Example</b>

Request: GET /code/new

Response:

<img src = "https://user-images.githubusercontent.com/92060452/198856179-58f77063-5768-42ed-8e8f-65e581118f13.png" height="349" width = "429"/>
