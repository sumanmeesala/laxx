matrixJob('learning_popularity_nc_cube_data_list_builder_main') {
    description('This is an learning_popularity_nc_cube_data_list_builder_main Job DSL job')
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
        shell('echo "Im learning_popularity_nc_cube_data_list_builder_main"')
    }
            publishers {
              downstream('learning_popularity_cube_cardinality_builder_main_athena')
                   }
}