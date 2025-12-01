// 函数: _ZN9ascension6CWorld10CreateCardEPKc
// 地址: 0xf6e14
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (ascension::CDatabase::GetCard(ascension::g_Database) == 0)
    return 0

return ascension::CWorld::CreateCard(arg1) __tailcall
