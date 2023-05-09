matrixJob('learning_popularity_cube_cardinality_builder_main_athena') {
    description('This is an learning_popularity_cube_cardinality_builder_main_athena Job DSL job')
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
        shell('echo "Im learning_popularity_cube_cardinality_builder_main_athena"')
    }
            publishers {
              downstream('learning_popularity_cube_cardinality_nc_builder_main')
                   }
}
