function count
{
	local var1=$(ls -l -a | wc -l ) #accounts for files(hidden) and directories
	let var1=var1-1	
	echo $var1
}

var1=$(count)
while [[ true ]]
do
echo "enter your guess"
read var2
if [[ !($var2 =~ [0-9]+) ]]
then echo "enter numeric input"
continue
elif [[ var1 -eq var2 ]]
then
	echo "Congratulations you are right"
	break
elif [[ var2 -lt var1 ]]
then
	echo "too less"
elif [[ var2 -gt var1 ]]
then
	echo "too much"
fi
done
