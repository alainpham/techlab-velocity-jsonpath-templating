techlab-velocity-jsonpath-templating
=========================================

This project aims at showing how to use JsonPath with Velocity Templates in order to have a powerfull json templating tool in Fuse(Camel).

The main idea is to wrap a producer endpoint in a Bean thats able to execute the camel-jsonpath component and be able to call it whithin the velocity template. 



To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

For more help see the Apache Camel documentation

    http://camel.apache.org/

To run a test:
    
curl -X POST \
  http://localhost:7123/ \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -d '{	"list" : [{		"key" : "ttt",		"val" : 1	},	{"key" : 4}	]}'
