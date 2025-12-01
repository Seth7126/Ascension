// 函数: _ZN14ascensionrules32RegisterFunctionsActiveConditionEv
// 地址: 0xff36c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t i_1 = 0x67
void** r4 = &data_1e25b4
int32_t result
int32_t i

do
    result = ascension::AddEffectActiveConditionFunc(*(r4 - 4), *r4, &r4[1])
    r4 = &r4[0xa]
    i = i_1
    i_1 -= 1
while (i != 1)
return result
