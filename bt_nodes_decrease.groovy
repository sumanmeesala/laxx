matrixJob('bt_nodes_decrease') {
    description('This is an bt_nodes_decrease Job DSL job')
    
   axes {
           axis {
                 name('corpId')
                 valueString(CC_CLIENTS)
                }
      
        }
  
    scm {
        git('https://github.com/sumanmeesala/laxx.git')
    }

    steps {
        shell('echo "Im bt_nodes_decrease"')
    }
}
