// 函数: _ZN14ascensionrules29CStateMayPutConstructIntoPlay10EnterStateER13CStateMachine
// 地址: 0x13ac80
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
uint32_t result = *(arg1 + 0x254)

if (result != 0)
    void* r0 = __dynamic_cast(result, _typeinfo_for_ascension::CEvent, 
        _typeinfo_for_ascension::CEventAcquireCard, 0)
    
    if (r0 != 0)
        result = zx.d(*(r0 + 0x60))
    
    if (r0 == 0 || result != 0)
        int32_t var_1c = 0
        CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa023, "Put into Play", 
            ascensionrules::CStateMayPutConstructIntoPlay::SelectPutIntoPlay)
        *(arg1 + 0x24c)
        jump(*(*arg1 + 0x34))

return result
