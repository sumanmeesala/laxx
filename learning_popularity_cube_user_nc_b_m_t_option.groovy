
package hudson.cli;

import jenkins.model.Jenkins;
import hudson.model.ListView;

Jenkins jenkins = Jenkins.getInstance()


matrixJob('learning_popularity_cube_user_nc_b_m_t_option') {
    description('This is an learning_popularity_cube_user_nc_b_m_t_option Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString(CC_CLIENTS)
                }
      
        }


    steps {
        shell('echo "Im learning_popularity_cube_user_nc_b_m_t_option"')
    }
            publishers {
              downstream('mlp_cluster_compute_time_stamp_main_athna')
                   }
                             
myView = hudson.model.Hudson.instance.getView('Athna')
myView.doAddJobToView('learning_popularity_cube_user_nc_b_m_t_option') 
jenkins.save()

}

