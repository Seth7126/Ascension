// 函数: _ZN14ascensionrules31IfYouDoAndCurrentEventIsMechanaEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x1014b8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

bool cond:0 = arg5 u> 0

if (arg5 != 0)
    cond:0 = *arg5 u> arg4

if (cond:0 && zx.d(*(arg5 + arg4 + 4)) != 0 && *(arg5 + (arg4 << 5) + 0x10) != 0)
    void* r0_1 = *(arg1 + 0xa6c)
    
    if (r0_1 != 0)
        return ascension::CCard::IsCardFaction(*(*(r0_1 + 0x10) + 0xc)) __tailcall

return 0
