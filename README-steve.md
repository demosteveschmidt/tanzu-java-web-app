# tanzu java web app with vscode

schmidtst@schmidtstQP6XQ ~ % %{ps ax | grep tanzu-java-web-app-00001-deployment-7bcc5fd555-d5bp5
57749   ??  S      0:00.12 kubectl port-forward tanzu-java-web-app-00001-deployment-7bcc5fd555-d5bp5 --namespace dev-steve 20000:9005
57816 s007  S+     0:00.01 grep tanzu-java-web-app-00001-deployment-7bcc5fd555-d5bp5

## Solution

Did not work at first. 
Troubleshooted with manual "kubectl port forward".
At the end, changed a couple of settings in the "Debugger for Java" VSCode extension.
See screenshot.

I *think* the most important was disabling JDWP Async
I also turned down the number of vars from 100 to 10
and turned up the timeout from 3'000 to 30'000

See "Screenshot 2023-04-19 at 16.27.50", "... 16.29.18", "... 16.29.28"
