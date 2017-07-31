/*
 *    Copyright 2017 ThirtyDegressRay
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.thirtydegreesray.openhub.mvp.contract;

import com.thirtydegreesray.openhub.dao.DaoSession;
import com.thirtydegreesray.openhub.mvp.model.Repository;
import com.thirtydegreesray.openhub.mvp.presenter.BasePresenter;
import com.thirtydegreesray.openhub.ui.fragment.RepositoriesFragment;

import java.util.ArrayList;

/**
 * Created on 2017/7/18.
 *
 * @author ThirtyDegreesRay
 */

public interface IRepositoriesContract {

    interface View extends IBaseView{

        void showRepositories(ArrayList<Repository> repositoryList);

        void showLoadingView();

        void hideLoadingView();

        void showLoadError(String errorMsg);

    }

    abstract class Presenter extends BasePresenter<IRepositoriesContract.View>{

        public Presenter(DaoSession daoSession) {
            super(daoSession);
        }

        public abstract void loadRepositories(RepositoriesFragment.RepositoriesType repositoriesType
                , String language, boolean isReLoad);
    }

}
