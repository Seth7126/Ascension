// 函数: _ZNK9ascension6CWorld16QueryCardFactionEPKNS_7CPlayerEPKN4core13CCardInstanceENS_12ECardFactionE
// 地址: 0xf3f00
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r6 = *(arg3 + 0xc)
int32_t result = 1

if (ascension::CCard::IsCardFaction(r6) == 0)
    int32_t r0_12
    int32_t entry_r3
    
    if (*(r6 + 0x88) == 3 && entry_r3 == 3 && *(arg2 + 0xa8) s>= 1)
        r0_12 = ascension::CPlayer::HasConstructInPlay(arg2)
    
    if (*(r6 + 0x88) != 3 || entry_r3 != 3 || *(arg2 + 0xa8) s< 1 || r0_12 == 0)
        result = 0
        int32_t var_80_1 = 2
        int32_t var_7c_1 = 0
        void* __offset(vtable_for_ascension::CEventQueryCardFaction, 0x8) var_84_1 =
            _vtable_for_ascension::CEventQueryCardFaction + 8
        core::CCardInstance const* var_38_1 = arg2
        int32_t var_34_1 = arg3
        char var_2c_1 = 0
        int32_t var_30_1 = 1 << entry_r3
        ascension::CWorld** r6_1 = *(arg1 + 0xaa4)
        int32_t r1_1 = *(arg1 + 0xaa8)
        
        if (r6_1 != r1_1)
            do
                ascension::CWorld* r0_6 = *r6_1
                
                if ((zx.d(*(r0_6 + 0x148)) & 4) != 0)
                    ascension::CActiveEffectInstance::HandleQuery(r0_6, arg1)
                    r1_1 = *(arg1 + 0xaa8)
                
                r6_1 = &r6_1[1]
            while (r6_1 != r1_1)
            
            result = 0
        
        ascension::CEvent::~CEvent()

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
