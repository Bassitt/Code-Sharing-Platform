<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/css/styles.css">
    <title>Latest</title>
    <link rel="stylesheet"
              href="//cdn.jsdelivr.net/gh/highlightjs/cdn-release@10.2.1/build/styles/default.min.css">
        <script src="//cdn.jsdelivr.net/gh/highlightjs/cdn-release@10.2.1/build/highlight.min.js"></script>
        <script>hljs.initHighlightingOnLoad();</script>
</head>
<body>
<#list codes as code>
    <div class="code-container">
        <span class="date">${code.date}</span>
        <pre  class="code"><code>${code.code}</code></pre>
        <br>
    </div>
</#list>

</body>
</html>