


matrixJob('subject_recommendations_b_m') {
    description('This is an subject_recommendations_b_m Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString(CC_CLIENTS)
                }
      
        }


    steps {
        shell('echo "Im subject_recommendations_b_m"')
    }
            publishers {
              downstream('subject_recommendations_nc_b_m')
                   }
}

