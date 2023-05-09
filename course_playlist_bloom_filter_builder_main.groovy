job('course_playlist_bloom_filter_builder_main') {
    description('This is an course_playlist_bloom_filter_builder_main Job DSL job')
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
        shell('echo "Im course_playlist_bloom_filter_builder_main"')
    }
            publishers {
              downstream('ou_substitution_builder_main_athena')
                   }
}
