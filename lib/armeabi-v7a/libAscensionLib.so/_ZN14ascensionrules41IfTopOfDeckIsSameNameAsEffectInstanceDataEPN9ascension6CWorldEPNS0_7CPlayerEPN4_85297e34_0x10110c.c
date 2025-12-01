// 函数: _ZN14ascensionrules41IfTopOfDeckIsSameNameAsEffectInstanceDataEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x10110c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* entry_r6
ascension::CPlayer* var_18 = entry_r6
uint32_t result = 0
bool cond:0 = arg5 u> 0

if (arg5 != 0)
    entry_r6 = arg2
    cond:0 = *arg5 u> arg4

if (cond:0 && zx.d(*(arg5 + arg4 + 4)) != 0 && zx.d(*(arg5 + (arg4 << 5) + 0x10)) != 0)
    int32_t r0_4 = core::CWorldBase::GetInstanceByID(arg1)
    
    if (r0_4 != 0)
        result = 0
        void* r0_5 = __dynamic_cast(r0_4, _typeinfo_for_core::CInstance, 
            _typeinfo_for_core::CCardInstance, 0)
        
        if (r0_5 != 0)
            void* r9_1 = *(r0_5 + 0xc)
            
            if (zx.d(*(arg1 + 0xa14)) == 0 || *(entry_r6 + 0x9c) != 0
                    || *(*(entry_r6 + 0x38) + 0x18) s<= 1)
                int32_t* r0_11 = ascension::CPlayer::RevealTopCardFromDeck(entry_r6.b)
                
                if (r0_11 != 0)
                    core::CWorldBase::OutputMessageFormat(arg1, "%s reveals "%s"\n", 
                        entry_r6 + 0x10, (*(*r0_11 + 0xc))(r0_11))
                    int32_t r2_2 = *(r9_1 + 0x88)
                    void* r1_7 = r0_11[3]
                    int32_t r0_16 = *(r0_5 + 0xc)
                    int32_t temp0_1 = 0
                    uint32_t i = r2_2 - 6
                    
                    while (i != 0)
                        i u>>= 1
                        temp0_1 += 1
                    
                    int32_t temp0_2 = 0
                    void* i_1 = r0_16 - r1_7
                    
                    while (i_1 != 0)
                        i_1 u>>= 1
                        temp0_2 += 1
                    
                    result = (0x20 - temp0_2) u>> 5 | (0x20 - temp0_1) u>> 5
                    
                    if (r2_2 == 6 && r0_16 != r1_7)
                        int32_t temp0_3 = 0
                        int32_t i_2 = strcasecmp(r9_1 + 0x44, r1_7 + 0x44)
                        
                        while (i_2 != 0)
                            i_2 u>>= 1
                            temp0_3 += 1
                        
                        return (0x20 - temp0_3) u>> 5

return result
