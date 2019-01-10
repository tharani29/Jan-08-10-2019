<html>
	<head>
		<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
		<script>
			let fetchDateTime = () => {
				$("#datetimemessage").load("/datetime");
			};
			
			$().ready(() => {
				window.setInterval("fetchDateTime()",1000);
				
				$("#palindromebutton").on("click", () => {
					let word = $("#wordforpalindrome").val();
					$("#palindromemessage").load("/palindrome/" + word);
				});
				
				$("#anagrambutton").on("click", () => {
					let word = $("#wordforanagram").val();
					$("#anagrammessage").load("/anagram/" + word);
				});
				
			});
		</script>
	</head>
	<body>
		<h3 id="datetimemessage"></h3>
		<hr/>
		<h1>Word Activity</h1>
		<input type="text" placeholder="Word" id="wordforpalindrome">
		<br/>
		<button id="palindromebutton">Is Palindrome?</button>
		<h2 id="palindromemessage"></h2>
		<hr/>
		<input type="text" placeholder="Word" id="wordforanagram">
		<br/>
		<button id="anagrambutton">Anagram</button>
		<h2 id="anagrammessage"></h2>
	</body>
</html>