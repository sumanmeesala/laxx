


matrixJob('learning_popularity_cube_user_nc_b_m') {
    description('This is an learning_popularity_cube_user_nc_b_m Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString(CC_CLIENTS)
                }
      
        }


    steps {
        shell('echo "Im learning_popularity_cube_user_nc_b_m"')
    }
            publishers {
              downstream('learning_popularity_cube_user_b_m_athna_t_option')
                   }
}

