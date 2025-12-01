// 函数: _ZN14ascensionrules42IfEffectInstanceDataIsMonsterWithCostOver7EPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x100ee0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

bool cond:0 = arg5 u> 0

if (arg5 != 0)
    cond:0 = *arg5 u> arg4

if (cond:0 && zx.d(*(arg5 + arg4 + 4)) != 0 && zx.d(*(arg5 + (arg4 << 5) + 0x10)) != 0)
    int32_t r0_1 = core::CWorldBase::GetInstanceByID(arg1)
    
    if (r0_1 != 0)
        void* r0_2 = __dynamic_cast(r0_1, _typeinfo_for_core::CInstance, 
            _typeinfo_for_core::CCardInstance, 0)
        
        if (r0_2 != 0)
            void* r0_3 = *(r0_2 + 0xc)
            
            if (*(r0_3 + 0x88) == 3)
                if (*(r0_3 + 0xa0) s> 6)
                    return 1

return 0
