


matrixJob('learning_popularity_cube_cardinality_b_m_athna') {
    description('This is an learning_popularity_cube_cardinality_b_m_athna Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString(CC_CLIENTS)
                }
      
        }


    steps {
        shell('echo "Im learning_popularity_cube_cardinality_b_m_athna"')
    }
            publishers {
              downstream('learning_popularity_cube_cardinality_nc_b_m')
                   }
}

