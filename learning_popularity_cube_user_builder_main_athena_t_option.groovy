matrixJob('learning_popularity_cube_user_builder_main_athena_t_option') {
    description('This is an learning_popularity_cube_user_builder_main_athena_t_option Job DSL job')
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
        shell('echo "Im learning_popularity_cube_user_builder_main_athena_t_option"')
    }
            publishers {
              downstream('learning_popularity_cube_user_nc_builder_main_t_option')
                   }
}
