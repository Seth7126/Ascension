// 函数: _ZN14ascensionrules20IfPlayedCopyableHeroEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x100580
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r1 = *(arg1 + 0xb80)
int32_t r2 = *(arg1 + 0xb84)

if (r1 == r2)
    return 0

do
    if ((zx.d(r1[1].b) & 1) == 0)
        void* r3_1 = *r1
        
        if (r3_1 != 0 && zx.d(*(*(r3_1 + 0xc) + 0xc9)) == 0)
            return 1
    
    r1 = &r1[2]
while (r2 != r1)

return 0
