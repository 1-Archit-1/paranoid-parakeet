Readme.md : guessinggame.sh
	touch Readme.md
	echo "TITLE: Guessing Game">Readme.md
	echo "No of lines of code: ">>Readme.md
	cat guessinggame.sh | wc -l>>Readme.md 
	date "+%F %T">>Readme.md 
