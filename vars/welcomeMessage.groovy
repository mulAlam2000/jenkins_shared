def call(){
node{
sh '''
echo 'this is a text inserted to test shared library'
echo 'bye'
'''
}
}
