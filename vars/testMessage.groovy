def call(){
node{
sh '''
ehco 'this is a text inserted to test shared library in jenkins pipelines'
echo 'bye'
'''
}
}
