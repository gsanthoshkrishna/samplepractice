def firstTest16() {
    def me = sh (script:'git show --name-only origin/master',returnStdout:true).trim().split('/')
    println(me[0])
    println(me[1])
    println(me[2])
    
}

return this