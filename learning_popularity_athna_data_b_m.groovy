


matrixJob('learning_popularity_athna_data_b_m') {
    description('This is an learning_popularity_athna_data_b_m Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString(CC_CLIENTS)
                }
      
        }


    steps {
        shell('echo "Im learning_popularity_athna_data_b_m"')
    }
            publishers {
              downstream('learning_popularity_nc_athna_data_b_m')
                   }
}

