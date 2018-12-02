#!/bin/sh

echo "start running"
echo "------------"
print_empty(){

	echo ""
	echo "--------------------------------------------"
	echo ""
}

curl -u op:op -i -X GET -H "Content-Type: application/json" \
      		http://localhost:8080/getDuck
echo "------------"
echo "finish running"
exit 0
