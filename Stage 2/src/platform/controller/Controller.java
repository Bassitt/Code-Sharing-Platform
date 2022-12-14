package platform.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import platform.model.Code;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class Controller {

    private final String titleData = "Code";
    private final String codeData = "public static void main(String[] args) {\n    SpringApplication.run(CodeSharingPlatform.class, args);\n}";

    private final Code code = new Code(titleData, codeData, getCurrentDateTime());

    public Controller() {
    }

    @GetMapping(path = "/api/code", produces = "application/json;charset=UTF-8")
    public Code getApiCode() {
        return code;
    }

    @GetMapping(path = "/code", produces = "text/html")
    public ResponseEntity<String> getHtmlCode() {
        String sendCode = "<title>" + code.getTitle() + "</title>"
                + "<body>"
                + "<span id=\"load_date\">" + code.getDate() + "</span>"
                + "<pre id=\"code_snippet\">" + code.getCode() + "</pre>"
                + "</body>";

        return ResponseEntity.ok()
                .body(sendCode);
    }

    @GetMapping(path = "/code/new", produces = "text/html")
    public ResponseEntity<String> getHtmlCodeNew() {
        String scriptJSgetTextArea = """
                <script type="text/javascript">
                function send() {
                    let object = {
                        "code": document.getElementById("code_snippet").value
                    };
                   \s
                    let json = JSON.stringify(object);
                   \s
                    let xhr = new XMLHttpRequest();
                    xhr.open("POST", '/api/code/new', false)
                    xhr.setRequestHeader('Content-type', 'application/json; charset=utf-8');
                    xhr.send(json);
                   \s
                    if (xhr.status == 200) {
                      alert("Success!");
                    }
                }</script>""";
        String sendCode = "<title>Create</title>"
                + "<body>"
                + "<textarea id=\"code_snippet\">...</textarea>"
                + "<button id=\"send_snippet\" type=\"submit\" onclick=\"send()\">Submit</button>"
                + scriptJSgetTextArea
                + "</body>";

        return ResponseEntity.ok()
                .body(sendCode);
    }

    @PostMapping(path = "/api/code/new", produces = "application/json;charset=UTF-8")
    public String setApiCode(@RequestBody Code recode) {
        code.setCode(recode.getCode());
        code.setTitle("Code");
        code.setDate(getCurrentDateTime());
        return "{}";
    }

    public String getCurrentDateTime() {
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return today.format(formatter);
    }

}