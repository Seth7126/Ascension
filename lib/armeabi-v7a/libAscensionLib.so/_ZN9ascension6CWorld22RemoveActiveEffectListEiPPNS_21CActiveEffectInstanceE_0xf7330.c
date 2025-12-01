// 函数: _ZN9ascension6CWorld22RemoveActiveEffectListEiPPNS_21CActiveEffectInstanceE
// 地址: 0xf7330
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg2 s< 1)
    return 

int32_t* entry_r2
int32_t* r4_1 = entry_r2
ascension::CActiveEffectInstance** i_1 = arg2
ascension::CActiveEffectInstance** i

do
    *r4_1
    r4_1 = &r4_1[1]
    ascension::CWorld::RemoveActiveEffect(arg1)
    i = i_1
    i_1 -= 1
while (i != 1)
