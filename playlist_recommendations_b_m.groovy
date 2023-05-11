


matrixJob('playlist_recommendations_b_m') {
    description('This is an playlist_recommendations_b_m Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString(CC_CLIENTS)
                }
      
        }


    steps {
        shell('echo "Im playlist_recommendations_b_m"')
    }
            publishers {
              downstream('playlist_recommendations_nc_b_m')
                   }
}

