matrixJob('learning_popularity_cube_user_nc_builder_main') {
    description('This is an learning_popularity_cube_user_nc_builder_main Job DSL job')
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
        shell('echo "Im learning_popularity_cube_user_nc_builder_main"')
    }
            publishers {
              downstream('learning_popularity_cube_user_builder_main_athena_t_option')
                   }
}
