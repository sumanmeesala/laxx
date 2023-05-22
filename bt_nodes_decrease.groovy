package hudson.cli;

import jenkins.model.Jenkins;
import hudson.model.ListView;
import hudson.model.*
import hudson.views.*
import hudson.plugins.emailext.*
        
        
Jenkins jenkins = Jenkins.getInstance()

String viewName = "sendEmail"
View view = Jenkins.instance.getView('Athna')
List<Job> jobs = view.getItems(Job)
Map<String, String> jobStatuses = [:]


matrixJob('bt_nodes_decrease') {
    description('This is an bt_nodes_decrease Job DSL job')
    
        triggers {
        cron('35 9 18 5 *') // Run the job at 8:00 AM every day
    }
   axes {
           axis {
                 name('corpId')
                 valueString(CC_CLIENTS)
                }
      
        }
  


    steps {
        shell('echo "Im bt_nodes_decrease"')
    }
    


    
myView = hudson.model.Hudson.instance.getView('Athna')
myView.doAddJobToView('bt_nodes_decrease') 
jenkins.save()

}

