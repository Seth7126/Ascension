// 函数: GetCardDataByName
// 地址: 0x18ff68
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CCard* r0_1 = ascension::CDatabase::GetCard(ascension::g_Database)

if (r0_1 == 0)
    return 0

FillCardData(arg2, r0_1, nullptr)
return 0x318
