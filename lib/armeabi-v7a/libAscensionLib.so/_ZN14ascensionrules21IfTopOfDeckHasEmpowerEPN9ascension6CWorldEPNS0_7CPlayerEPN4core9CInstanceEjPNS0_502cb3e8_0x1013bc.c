// 函数: _ZN14ascensionrules21IfTopOfDeckHasEmpowerEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x1013bc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t result

if (zx.d(*(arg1 + 0xa14)) != 0 && *(arg2 + 0x9c) == 0)
    result = 0

if (zx.d(*(arg1 + 0xa14)) == 0 || *(arg2 + 0x9c) != 0 || *(*(arg2 + 0x38) + 0x18) s<= 1)
    int32_t* r0_4 = ascension::CPlayer::RevealTopCardFromDeck(arg2.b)
    
    if (r0_4 == 0)
        return 0
    
    core::CWorldBase::OutputMessageFormat(arg1, "%s reveals "%s"\n", arg2 + 0x10, 
        (*(*r0_4 + 0xc))(r0_4))
    result = zx.d(*(r0_4[3] + 0xe4))
    
    if (result != 0)
        return 1

return result
