const http=require('http')
const child=require("child_process")

var server=http.createServer()
server.on('request',function(req,res){
	res.end("success!!")
	console.log("execFile")
	child.execFile('./cibuild.sh',function(error,stdout,stderr){
		console.log((stdout))
	})
})

server.listen(3201,function(err){
	if(!err)
		console.log("server start at port:"+3201)
	
})
