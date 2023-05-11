


matrixJob('delete_data_proc_cluster') {
    description('This is an delete_data_proc_cluster Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString(CC_CLIENTS)
                }
      
        }


    steps {
        shell('echo "Im delete_data_proc_cluster"')
    }

}

