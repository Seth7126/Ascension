// 函数: _ZN14ascensionrules35TriggerIfQueryCardAcquireIsThisCardEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfed60
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) != 6)
    return 0

int32_t r12_1 = *(arg3 + 0x50)

if (r12_1 s< 1)
    return 0

int32_t* r1 = *(arg3 + 0x54)
int32_t r2 = 0

do
    if (*r1 == *(arg2 + 0x10))
        return 1
    
    r2 += 1
    r1 = &r1[0x11]
while (r2 s< r12_1)

return 0
