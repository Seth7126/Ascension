// 函数: _ZN9ascension27CConstructAbilityDefinition21SetAbilityDescriptionEPKc
// 地址: 0xe47cc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char* entry_r1
strlen(entry_r1)
char* r0_3 = ascension::CDatabase::AllocateTextBuffer(ascension::g_Database)

if (r0_3 != 0)
    strcpy(r0_3, entry_r1)
    *(arg1 + 0x2c) = r0_3

int32_t result = strcasecmp(entry_r1, "Transform")

if (result == 0)
    result = 1
    arg1[0x1a0] = 1

return result
