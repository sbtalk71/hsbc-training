# hsbc-training
This is a public repository for sharing training materials

<script>
            let xhr;
            function postRequest() {
                let data = collectData();
                xhr = new XMLHttpRequest();
                xhr.onreadystatechange = processData;
                xhr.open("POST", "http://localhost:8080/api/rest/person/save", true);
                xhr.setRequestHeader("Content-Type", "application/json");
                xhr.send(data);
            }


            function processData() {
                if (xhr.readyState == 4 && xhr.status == 200) {
                    let response = xhr.responseText;
                    console.log(response);
                    document.getElementById("resp").innerHTML=response;
                }
            }

            function collectData() {
                let data = {
                    id: parseInt(document.getElementById("uid").value),
                    name: document.getElementById("un").value,
                    city: document.getElementById("city").value
                };
                console.log(data);
                return JSON.stringify(data);
            }
        </script>
