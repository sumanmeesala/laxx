
package hudson.cli;

import jenkins.model.Jenkins;
import hudson.model.ListView;

Jenkins jenkins = Jenkins.getInstance()


matrixJob('learning_popularity_cube_user_b_m_athna') {
    description('This is an learning_popularity_cube_user_b_m_athna Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString(CC_CLIENTS)
                }
      
        }


    steps {
        shell('echo "Im learning_popularity_cube_user_b_m_athna"')
    }
            publishers {
              downstream('learning_popularity_cube_user_nc__b_m')
                   }
                             
myView = hudson.model.Hudson.instance.getView('Athna')
myView.doAddJobToView('learning_popularity_cube_user_b_m_athna') 
jenkins.save()

}

