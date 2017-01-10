/*
    Copyright 1996-2008 Ariba, Inc.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

    $Id: //ariba/platform/ui/aribaweb/ariba/ui/aribaweb/util/AWResourceManagerFactory.java#4 $
*/

package ariba.ui.aribaweb.util;

import java.util.Locale;

public interface AWResourceManagerFactory
{
    public AWSingleLocaleResourceManager createResourceManager (AWMultiLocaleResourceManager multiLocaleResourceManager, Locale locale);
}
