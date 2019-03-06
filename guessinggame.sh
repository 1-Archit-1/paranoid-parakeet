function count
{
	local var1=$(ls -l | wc -l )
	let var1=var1-1	
	echo $var1
}

var1=$(count)
while [[ true ]]
do
echo "enter your guess"
read var2
if [[ var1 -eq var2 ]]
then
	echo "Congratulations you are right"
	break
else
echo "you are wrong try again"
fi
done
