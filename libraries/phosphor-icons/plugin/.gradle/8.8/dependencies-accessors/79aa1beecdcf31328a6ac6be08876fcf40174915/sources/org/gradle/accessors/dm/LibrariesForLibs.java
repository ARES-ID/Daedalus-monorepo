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
    private final ComSquareupOkioLibraryAccessors laccForComSquareupOkioLibraryAccessors = new ComSquareupOkioLibraryAccessors(owner);
    private final IoKtorLibraryAccessors laccForIoKtorLibraryAccessors = new IoKtorLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

    /**
     * Group of libraries at <b>comSquareupOkio</b>
     */
    public ComSquareupOkioLibraryAccessors getComSquareupOkio() {
        return laccForComSquareupOkioLibraryAccessors;
    }

    /**
     * Group of libraries at <b>ioKtor</b>
     */
    public IoKtorLibraryAccessors getIoKtor() {
        return laccForIoKtorLibraryAccessors;
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

    public static class ComSquareupOkioLibraryAccessors extends SubDependencyFactory {

        public ComSquareupOkioLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>okio</b> with <b>com.squareup.okio:okio</b> coordinates and
         * with version <b>3.9.0</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getOkio() {
            return create("comSquareupOkio.okio");
        }

    }

    public static class IoKtorLibraryAccessors extends SubDependencyFactory {

        public IoKtorLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>ktorClientCio</b> with <b>io.ktor:ktor-client-cio</b> coordinates and
         * with version reference <b>ktor</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKtorClientCio() {
            return create("ioKtor.ktorClientCio");
        }

        /**
         * Dependency provider for <b>ktorClientCore</b> with <b>io.ktor:ktor-client-core</b> coordinates and
         * with version reference <b>ktor</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKtorClientCore() {
            return create("ioKtor.ktorClientCore");
        }

        /**
         * Dependency provider for <b>ktorClientLogging</b> with <b>io.ktor:ktor-client-logging</b> coordinates and
         * with version reference <b>ktor</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKtorClientLogging() {
            return create("ioKtor.ktorClientLogging");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>kotlin</b> with value <b>2.0.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getKotlin() { return getVersion("kotlin"); }

        /**
         * Version alias <b>ktor</b> with value <b>2.3.12</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getKtor() { return getVersion("ktor"); }

        /**
         * Version alias <b>projectGroup</b> with value <b>com.rjspies</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getProjectGroup() { return getVersion("projectGroup"); }

        /**
         * Version alias <b>projectVersion</b> with value <b>1.0.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getProjectVersion() { return getVersion("projectVersion"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>comGradlePluginPublish</b> with plugin id <b>com.gradle.plugin-publish</b> and
         * with version <b>1.2.1</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getComGradlePluginPublish() { return createPlugin("comGradlePluginPublish"); }

        /**
         * Plugin provider for <b>ioGitlabArturboshDetekt</b> with plugin id <b>io.gitlab.arturbosch.detekt</b> and
         * with version <b>1.23.6</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getIoGitlabArturboshDetekt() { return createPlugin("ioGitlabArturboshDetekt"); }

        /**
         * Plugin provider for <b>orgJetbrainsKotlinJvm</b> with plugin id <b>org.jetbrains.kotlin.jvm</b> and
         * with version reference <b>kotlin</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getOrgJetbrainsKotlinJvm() { return createPlugin("orgJetbrainsKotlinJvm"); }

        /**
         * Plugin provider for <b>orgJmailenKotlinter</b> with plugin id <b>org.jmailen.kotlinter</b> and
         * with version <b>4.4.0</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getOrgJmailenKotlinter() { return createPlugin("orgJmailenKotlinter"); }

    }

}
