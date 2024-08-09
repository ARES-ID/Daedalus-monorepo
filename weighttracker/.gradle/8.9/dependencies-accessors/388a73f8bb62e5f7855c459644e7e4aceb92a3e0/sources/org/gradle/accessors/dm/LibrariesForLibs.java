package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the {@code libs} extension.
 */
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AndroidxActivityLibraryAccessors laccForAndroidxActivityLibraryAccessors = new AndroidxActivityLibraryAccessors(owner);
    private final AndroidxComposeMaterialLibraryAccessors laccForAndroidxComposeMaterialLibraryAccessors = new AndroidxComposeMaterialLibraryAccessors(owner);
    private final AndroidxComposeMaterial3LibraryAccessors laccForAndroidxComposeMaterial3LibraryAccessors = new AndroidxComposeMaterial3LibraryAccessors(owner);
    private final AndroidxComposeUiLibraryAccessors laccForAndroidxComposeUiLibraryAccessors = new AndroidxComposeUiLibraryAccessors(owner);
    private final AndroidxConstraintlayoutLibraryAccessors laccForAndroidxConstraintlayoutLibraryAccessors = new AndroidxConstraintlayoutLibraryAccessors(owner);
    private final AndroidxCoreLibraryAccessors laccForAndroidxCoreLibraryAccessors = new AndroidxCoreLibraryAccessors(owner);
    private final AndroidxLifecycleLibraryAccessors laccForAndroidxLifecycleLibraryAccessors = new AndroidxLifecycleLibraryAccessors(owner);
    private final AndroidxNavigationLibraryAccessors laccForAndroidxNavigationLibraryAccessors = new AndroidxNavigationLibraryAccessors(owner);
    private final AndroidxRoomLibraryAccessors laccForAndroidxRoomLibraryAccessors = new AndroidxRoomLibraryAccessors(owner);
    private final ComJakewhartonTimerLibraryAccessors laccForComJakewhartonTimerLibraryAccessors = new ComJakewhartonTimerLibraryAccessors(owner);
    private final ComPatrykandpatrickVicoLibraryAccessors laccForComPatrykandpatrickVicoLibraryAccessors = new ComPatrykandpatrickVicoLibraryAccessors(owner);
    private final EspressoLibraryAccessors laccForEspressoLibraryAccessors = new EspressoLibraryAccessors(owner);
    private final IoInsertKoinLibraryAccessors laccForIoInsertKoinLibraryAccessors = new IoInsertKoinLibraryAccessors(owner);
    private final IoKotestLibraryAccessors laccForIoKotestLibraryAccessors = new IoKotestLibraryAccessors(owner);
    private final JunitLibraryAccessors laccForJunitLibraryAccessors = new JunitLibraryAccessors(owner);
    private final OrgJetbrainsKotlinxLibraryAccessors laccForOrgJetbrainsKotlinxLibraryAccessors = new OrgJetbrainsKotlinxLibraryAccessors(owner);
    private final OrgJunitJupiterLibraryAccessors laccForOrgJunitJupiterLibraryAccessors = new OrgJunitJupiterLibraryAccessors(owner);
    private final OrgRoboelectricLibraryAccessors laccForOrgRoboelectricLibraryAccessors = new OrgRoboelectricLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

    /**
     * Dependency provider for <b>appcompat</b> with <b>androidx.appcompat:appcompat</b> coordinates and
     * with version reference <b>appcompat</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getAppcompat() {
        return create("appcompat");
    }

    /**
     * Dependency provider for <b>material</b> with <b>com.google.android.material:material</b> coordinates and
     * with version reference <b>material</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getMaterial() {
        return create("material");
    }

    /**
     * Group of libraries at <b>androidxActivity</b>
     */
    public AndroidxActivityLibraryAccessors getAndroidxActivity() {
        return laccForAndroidxActivityLibraryAccessors;
    }

    /**
     * Group of libraries at <b>androidxComposeMaterial</b>
     */
    public AndroidxComposeMaterialLibraryAccessors getAndroidxComposeMaterial() {
        return laccForAndroidxComposeMaterialLibraryAccessors;
    }

    /**
     * Group of libraries at <b>androidxComposeMaterial3</b>
     */
    public AndroidxComposeMaterial3LibraryAccessors getAndroidxComposeMaterial3() {
        return laccForAndroidxComposeMaterial3LibraryAccessors;
    }

    /**
     * Group of libraries at <b>androidxComposeUi</b>
     */
    public AndroidxComposeUiLibraryAccessors getAndroidxComposeUi() {
        return laccForAndroidxComposeUiLibraryAccessors;
    }

    /**
     * Group of libraries at <b>androidxConstraintlayout</b>
     */
    public AndroidxConstraintlayoutLibraryAccessors getAndroidxConstraintlayout() {
        return laccForAndroidxConstraintlayoutLibraryAccessors;
    }

    /**
     * Group of libraries at <b>androidxCore</b>
     */
    public AndroidxCoreLibraryAccessors getAndroidxCore() {
        return laccForAndroidxCoreLibraryAccessors;
    }

    /**
     * Group of libraries at <b>androidxLifecycle</b>
     */
    public AndroidxLifecycleLibraryAccessors getAndroidxLifecycle() {
        return laccForAndroidxLifecycleLibraryAccessors;
    }

    /**
     * Group of libraries at <b>androidxNavigation</b>
     */
    public AndroidxNavigationLibraryAccessors getAndroidxNavigation() {
        return laccForAndroidxNavigationLibraryAccessors;
    }

    /**
     * Group of libraries at <b>androidxRoom</b>
     */
    public AndroidxRoomLibraryAccessors getAndroidxRoom() {
        return laccForAndroidxRoomLibraryAccessors;
    }

    /**
     * Group of libraries at <b>comJakewhartonTimer</b>
     */
    public ComJakewhartonTimerLibraryAccessors getComJakewhartonTimer() {
        return laccForComJakewhartonTimerLibraryAccessors;
    }

    /**
     * Group of libraries at <b>comPatrykandpatrickVico</b>
     */
    public ComPatrykandpatrickVicoLibraryAccessors getComPatrykandpatrickVico() {
        return laccForComPatrykandpatrickVicoLibraryAccessors;
    }

    /**
     * Group of libraries at <b>espresso</b>
     */
    public EspressoLibraryAccessors getEspresso() {
        return laccForEspressoLibraryAccessors;
    }

    /**
     * Group of libraries at <b>ioInsertKoin</b>
     */
    public IoInsertKoinLibraryAccessors getIoInsertKoin() {
        return laccForIoInsertKoinLibraryAccessors;
    }

    /**
     * Group of libraries at <b>ioKotest</b>
     */
    public IoKotestLibraryAccessors getIoKotest() {
        return laccForIoKotestLibraryAccessors;
    }

    /**
     * Group of libraries at <b>junit</b>
     */
    public JunitLibraryAccessors getJunit() {
        return laccForJunitLibraryAccessors;
    }

    /**
     * Group of libraries at <b>orgJetbrainsKotlinx</b>
     */
    public OrgJetbrainsKotlinxLibraryAccessors getOrgJetbrainsKotlinx() {
        return laccForOrgJetbrainsKotlinxLibraryAccessors;
    }

    /**
     * Group of libraries at <b>orgJunitJupiter</b>
     */
    public OrgJunitJupiterLibraryAccessors getOrgJunitJupiter() {
        return laccForOrgJunitJupiterLibraryAccessors;
    }

    /**
     * Group of libraries at <b>orgRoboelectric</b>
     */
    public OrgRoboelectricLibraryAccessors getOrgRoboelectric() {
        return laccForOrgRoboelectricLibraryAccessors;
    }

    /**
     * Group of versions at <b>versions</b>
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Group of bundles at <b>bundles</b>
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Group of plugins at <b>plugins</b>
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class AndroidxActivityLibraryAccessors extends SubDependencyFactory {

        public AndroidxActivityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>activityCompose</b> with <b>androidx.activity:activity-compose</b> coordinates and
         * with version <b>1.9.1</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getActivityCompose() {
            return create("androidxActivity.activityCompose");
        }

    }

    public static class AndroidxComposeMaterialLibraryAccessors extends SubDependencyFactory {

        public AndroidxComposeMaterialLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>materialIconsExtendedAndroid</b> with <b>androidx.compose.material:material-icons-extended-android</b> coordinates and
         * with version <b>1.6.8</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMaterialIconsExtendedAndroid() {
            return create("androidxComposeMaterial.materialIconsExtendedAndroid");
        }

    }

    public static class AndroidxComposeMaterial3LibraryAccessors extends SubDependencyFactory {

        public AndroidxComposeMaterial3LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>material3</b> with <b>androidx.compose.material3:material3</b> coordinates and
         * with version <b>1.2.1</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMaterial3() {
            return create("androidxComposeMaterial3.material3");
        }

    }

    public static class AndroidxComposeUiLibraryAccessors extends SubDependencyFactory {

        public AndroidxComposeUiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>ui</b> with <b>androidx.compose.ui:ui</b> coordinates and
         * with version reference <b>compose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getUi() {
            return create("androidxComposeUi.ui");
        }

        /**
         * Dependency provider for <b>uiTextGoogleFonts</b> with <b>androidx.compose.ui:ui-text-google-fonts</b> coordinates and
         * with version reference <b>compose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getUiTextGoogleFonts() {
            return create("androidxComposeUi.uiTextGoogleFonts");
        }

    }

    public static class AndroidxConstraintlayoutLibraryAccessors extends SubDependencyFactory {

        public AndroidxConstraintlayoutLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>constraintlayoutCompose</b> with <b>androidx.constraintlayout:constraintlayout-compose</b> coordinates and
         * with version <b>1.0.1</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getConstraintlayoutCompose() {
            return create("androidxConstraintlayout.constraintlayoutCompose");
        }

    }

    public static class AndroidxCoreLibraryAccessors extends SubDependencyFactory {

        public AndroidxCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>coreKtx</b> with <b>androidx.core:core-ktx</b> coordinates and
         * with version <b>1.13.1</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCoreKtx() {
            return create("androidxCore.coreKtx");
        }

        /**
         * Dependency provider for <b>coreSplashscreen</b> with <b>androidx.core:core-splashscreen</b> coordinates and
         * with version <b>1.0.1</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCoreSplashscreen() {
            return create("androidxCore.coreSplashscreen");
        }

    }

    public static class AndroidxLifecycleLibraryAccessors extends SubDependencyFactory {

        public AndroidxLifecycleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>lifecycleRuntimeKtx</b> with <b>androidx.lifecycle:lifecycle-runtime-ktx</b> coordinates and
         * with version <b>2.8.4</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLifecycleRuntimeKtx() {
            return create("androidxLifecycle.lifecycleRuntimeKtx");
        }

    }

    public static class AndroidxNavigationLibraryAccessors extends SubDependencyFactory {

        public AndroidxNavigationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>navigationCompose</b> with <b>androidx.navigation:navigation-compose</b> coordinates and
         * with version <b>2.7.7</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getNavigationCompose() {
            return create("androidxNavigation.navigationCompose");
        }

    }

    public static class AndroidxRoomLibraryAccessors extends SubDependencyFactory {

        public AndroidxRoomLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>roomCompiler</b> with <b>androidx.room:room-compiler</b> coordinates and
         * with version reference <b>room</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRoomCompiler() {
            return create("androidxRoom.roomCompiler");
        }

        /**
         * Dependency provider for <b>roomKtx</b> with <b>androidx.room:room-ktx</b> coordinates and
         * with version reference <b>room</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRoomKtx() {
            return create("androidxRoom.roomKtx");
        }

        /**
         * Dependency provider for <b>roomRuntime</b> with <b>androidx.room:room-runtime</b> coordinates and
         * with version reference <b>room</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRoomRuntime() {
            return create("androidxRoom.roomRuntime");
        }

    }

    public static class ComJakewhartonTimerLibraryAccessors extends SubDependencyFactory {

        public ComJakewhartonTimerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>timber</b> with <b>com.jakewharton.timber:timber</b> coordinates and
         * with version <b>5.0.1</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTimber() {
            return create("comJakewhartonTimer.timber");
        }

    }

    public static class ComPatrykandpatrickVicoLibraryAccessors extends SubDependencyFactory {

        public ComPatrykandpatrickVicoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>composeM3</b> with <b>com.patrykandpatrick.vico:compose-m3</b> coordinates and
         * with version <b>1.15.0</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getComposeM3() {
            return create("comPatrykandpatrickVico.composeM3");
        }

    }

    public static class EspressoLibraryAccessors extends SubDependencyFactory {

        public EspressoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>androidx.test.espresso:espresso-core</b> coordinates and
         * with version reference <b>espresso.core</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("espresso.core");
        }

    }

    public static class IoInsertKoinLibraryAccessors extends SubDependencyFactory {

        public IoInsertKoinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>koinAndroidxCompose</b> with <b>io.insert-koin:koin-androidx-compose</b> coordinates and
         * with version reference <b>koin</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKoinAndroidxCompose() {
            return create("ioInsertKoin.koinAndroidxCompose");
        }

        /**
         * Dependency provider for <b>koinAnnotations</b> with <b>io.insert-koin:koin-annotations</b> coordinates and
         * with version reference <b>koin.annotations</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKoinAnnotations() {
            return create("ioInsertKoin.koinAnnotations");
        }

        /**
         * Dependency provider for <b>koinCore</b> with <b>io.insert-koin:koin-core</b> coordinates and
         * with version reference <b>koin</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKoinCore() {
            return create("ioInsertKoin.koinCore");
        }

        /**
         * Dependency provider for <b>koinKspCompiler</b> with <b>io.insert-koin:koin-ksp-compiler</b> coordinates and
         * with version reference <b>koin.annotations</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKoinKspCompiler() {
            return create("ioInsertKoin.koinKspCompiler");
        }

        /**
         * Dependency provider for <b>koinTestJunit4</b> with <b>io.insert-koin:koin-test-junit4</b> coordinates and
         * with version <b>3.5.6</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKoinTestJunit4() {
            return create("ioInsertKoin.koinTestJunit4");
        }

    }

    public static class IoKotestLibraryAccessors extends SubDependencyFactory {

        public IoKotestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>kotestProperty</b> with <b>io.kotest:kotest-property</b> coordinates and
         * with version <b>5.9.1</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKotestProperty() {
            return create("ioKotest.kotestProperty");
        }

    }

    public static class JunitLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public JunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>junit</b> with <b>androidx.test.ext:junit</b> coordinates and
         * with version reference <b>junit</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("junit");
        }

        /**
         * Dependency provider for <b>junit</b> with <b>junit:junit</b> coordinates and
         * with version <b>4.13.2</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJunit() {
            return create("junit.junit");
        }

    }

    public static class OrgJetbrainsKotlinxLibraryAccessors extends SubDependencyFactory {

        public OrgJetbrainsKotlinxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>kotlinxCoroutinesAndroid</b> with <b>org.jetbrains.kotlinx:kotlinx-coroutines-android</b> coordinates and
         * with version <b>1.8.1</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKotlinxCoroutinesAndroid() {
            return create("orgJetbrainsKotlinx.kotlinxCoroutinesAndroid");
        }

    }

    public static class OrgJunitJupiterLibraryAccessors extends SubDependencyFactory {

        public OrgJunitJupiterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>junitJupiterApi</b> with <b>org.junit.jupiter:junit-jupiter-api</b> coordinates and
         * with version reference <b>junit5</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJunitJupiterApi() {
            return create("orgJunitJupiter.junitJupiterApi");
        }

        /**
         * Dependency provider for <b>junitJupiterEngine</b> with <b>org.junit.jupiter:junit-jupiter-engine</b> coordinates and
         * with version reference <b>junit5</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJunitJupiterEngine() {
            return create("orgJunitJupiter.junitJupiterEngine");
        }

    }

    public static class OrgRoboelectricLibraryAccessors extends SubDependencyFactory {

        public OrgRoboelectricLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>roboelectric</b> with <b>org.robolectric:robolectric</b> coordinates and
         * with version <b>4.13</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRoboelectric() {
            return create("orgRoboelectric.roboelectric");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final EspressoVersionAccessors vaccForEspressoVersionAccessors = new EspressoVersionAccessors(providers, config);
        private final KoinVersionAccessors vaccForKoinVersionAccessors = new KoinVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>androidGradlePlugin</b> with value <b>8.5.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getAndroidGradlePlugin() { return getVersion("androidGradlePlugin"); }

        /**
         * Version alias <b>appcompat</b> with value <b>1.7.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getAppcompat() { return getVersion("appcompat"); }

        /**
         * Version alias <b>compileSdk</b> with value <b>34</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCompileSdk() { return getVersion("compileSdk"); }

        /**
         * Version alias <b>compose</b> with value <b>1.6.8</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCompose() { return getVersion("compose"); }

        /**
         * Version alias <b>composeCompiler</b> with value <b>1.5.14</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getComposeCompiler() { return getVersion("composeCompiler"); }

        /**
         * Version alias <b>java</b> with value <b>17</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJava() { return getVersion("java"); }

        /**
         * Version alias <b>javaVendor</b> with value <b>ORACLE</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJavaVendor() { return getVersion("javaVendor"); }

        /**
         * Version alias <b>junit</b> with value <b>1.2.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJunit() { return getVersion("junit"); }

        /**
         * Version alias <b>junit5</b> with value <b>5.10.3</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJunit5() { return getVersion("junit5"); }

        /**
         * Version alias <b>kotlin</b> with value <b>2.0.10</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getKotlin() { return getVersion("kotlin"); }

        /**
         * Version alias <b>kotlinxCoroutinesAndroid</b> with value <b>1.7.3</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getKotlinxCoroutinesAndroid() { return getVersion("kotlinxCoroutinesAndroid"); }

        /**
         * Version alias <b>ksp</b> with value <b>2.0.10-1.0.24</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getKsp() { return getVersion("ksp"); }

        /**
         * Version alias <b>material</b> with value <b>1.12.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getMaterial() { return getVersion("material"); }

        /**
         * Version alias <b>minSdk</b> with value <b>31</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getMinSdk() { return getVersion("minSdk"); }

        /**
         * Version alias <b>namespace</b> with value <b>com.rjspies.daedalus</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getNamespace() { return getVersion("namespace"); }

        /**
         * Version alias <b>room</b> with value <b>2.6.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getRoom() { return getVersion("room"); }

        /**
         * Version alias <b>targetSdk</b> with value <b>34</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getTargetSdk() { return getVersion("targetSdk"); }

        /**
         * Version alias <b>versionCodeOffset</b> with value <b>200000</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersionCodeOffset() { return getVersion("versionCodeOffset"); }

        /**
         * Version alias <b>versionName</b> with value <b>1.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersionName() { return getVersion("versionName"); }

        /**
         * Group of versions at <b>versions.espresso</b>
         */
        public EspressoVersionAccessors getEspresso() {
            return vaccForEspressoVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.koin</b>
         */
        public KoinVersionAccessors getKoin() {
            return vaccForKoinVersionAccessors;
        }

    }

    public static class EspressoVersionAccessors extends VersionFactory  {

        public EspressoVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>espresso.core</b> with value <b>3.6.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCore() { return getVersion("espresso.core"); }

    }

    public static class KoinVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public KoinVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>koin</b> with value <b>3.5.6</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("koin"); }

        /**
         * Version alias <b>koin.annotations</b> with value <b>1.3.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getAnnotations() { return getVersion("koin.annotations"); }

        /**
         * Version alias <b>koin.test</b> with value <b>3.4.3</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getTest() { return getVersion("koin.test"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>comAndroidApplication</b> with plugin id <b>com.android.application</b> and
         * with version reference <b>androidGradlePlugin</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getComAndroidApplication() { return createPlugin("comAndroidApplication"); }

        /**
         * Plugin provider for <b>comAndroidLibrary</b> with plugin id <b>com.android.library</b> and
         * with version reference <b>androidGradlePlugin</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getComAndroidLibrary() { return createPlugin("comAndroidLibrary"); }

        /**
         * Plugin provider for <b>comGoogleDevtoolsKsp</b> with plugin id <b>com.google.devtools.ksp</b> and
         * with version reference <b>ksp</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getComGoogleDevtoolsKsp() { return createPlugin("comGoogleDevtoolsKsp"); }

        /**
         * Plugin provider for <b>deMannodermausAndroidJunit5</b> with plugin id <b>de.mannodermaus.android-junit5</b> and
         * with version reference <b>junit5</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getDeMannodermausAndroidJunit5() { return createPlugin("deMannodermausAndroidJunit5"); }

        /**
         * Plugin provider for <b>ioGithubAdityahaskarDependencygraph</b> with plugin id <b>io.github.adityabhaskar.dependencygraph</b> and
         * with version <b>0.1.6</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getIoGithubAdityahaskarDependencygraph() { return createPlugin("ioGithubAdityahaskarDependencygraph"); }

        /**
         * Plugin provider for <b>ioGitlabArturboschDetekt</b> with plugin id <b>io.gitlab.arturbosch.detekt</b> and
         * with version <b>1.23.6</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getIoGitlabArturboschDetekt() { return createPlugin("ioGitlabArturboschDetekt"); }

        /**
         * Plugin provider for <b>orgJetbrainsKotlinAndroid</b> with plugin id <b>org.jetbrains.kotlin.android</b> and
         * with version reference <b>kotlin</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getOrgJetbrainsKotlinAndroid() { return createPlugin("orgJetbrainsKotlinAndroid"); }

        /**
         * Plugin provider for <b>orgJetbrainsKotlinPluginCompose</b> with plugin id <b>org.jetbrains.kotlin.plugin.compose</b> and
         * with version reference <b>kotlin</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getOrgJetbrainsKotlinPluginCompose() { return createPlugin("orgJetbrainsKotlinPluginCompose"); }

        /**
         * Plugin provider for <b>orgJmailenKotlinter</b> with plugin id <b>org.jmailen.kotlinter</b> and
         * with version <b>4.4.1</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getOrgJmailenKotlinter() { return createPlugin("orgJmailenKotlinter"); }

    }

}
