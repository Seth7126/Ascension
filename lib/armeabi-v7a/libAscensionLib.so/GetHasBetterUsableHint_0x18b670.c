// 函数: GetHasBetterUsableHint
// 地址: 0x18b670
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r4 = 0
int32_t r0 = *__stack_chk_guard
uint32_t r0_1 = *s_pWorldData
uint32_t result = 0
int32_t var_50
__builtin_memset(&var_50, 0, 0x20)

if (r0_1 != 0)
    r4 = *(r0_1 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)

int32_t r0_4 = core::CWorldBase::GetInstanceByID(r4)

if (r0_4 != 0)
    int32_t r0_5 =
        __dynamic_cast(r0_4, _typeinfo_for_core::CInstance, _typeinfo_for_core::CCardInstance, 0)
    int32_t r8_1 = r0_5
    
    if (r0_5 == 0)
        void* r0_7 = __dynamic_cast(r0_4, _typeinfo_for_core::CInstance, 
            _typeinfo_for_ascension::CCardStackUniformAscension, 0)
        
        if (r0_7 != 0)
            r8_1 = *(r0_7 + 0x14)
        
        if (r8_1 == 0)
            goto label_18c1c8
        
        goto label_18b77c
    
    uint32_t result_1
    
    if (r8_1 != 0)
    label_18b77c:
        int32_t r0_9 =
            GameOptionManager::IsSelectableInstanceID((*(s_InterfaceContext + 8)).w, arg2 & 0xffff)
        
        if (0xffff5fe0 + zx.d(arg1) u> 0x22)
            goto label_18c1c8
        
        int32_t var_100_1 = r8_1
        char var_ec[0x18]
        int32_t var_d0
        void* __offset(vtable_for_ascension::CEventQueryCardDefeatAttributes, 0x8) var_a8
        
        switch (arg1)
            case 0xa020, 0xa021, 0xa025, 0xa02d
                if (r0_9 s< 1)
                    goto label_18c1c8
                
                int32_t r3_1 = 0
                
                while (true)
                    int32_t r0_41 = (&var_50)[r3_1]
                    int32_t var_f0_2 = r3_1
                    
                    if ((r0_41 | 4) == 0xa027)
                        ascension::CWorld* r2_3 = 7
                        
                        if (ascension::CWorld::IsCardInCenterRow(r4) == 0)
                            ascension::CWorld* r0_22 = ascension::CWorld::IsCardInKingdomStack(r4)
                            r2_3 = r0_22
                            
                            if (r0_22 != 0)
                                r2_3 = 6
                        
                        int32_t var_a4_1 = 6
                        int32_t var_a0_1 = 0
                        var_a8 = _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
                        int32_t var_5c_1 = *(s_InterfaceContext + 0xc)
                        int32_t var_58_1 = 0
                        char (* var_54_1)[0x18] = &var_ec
                        ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_a8, r8_1, 
                            r2_3)
                        ascension::CWorld::HandleQuery(r4)
                        int32_t var_104_1 = 1
                        
                        if (var_d0 s>= 1)
                            int32_t r8_2 = 0
                            int32_t r10_1 = 0x30
                            
                            do
                                if (zx.d(var_ec[r8_2 + 0x20]) == 4)
                                    *(&var_ec + r10_1)
                                    int32_t r0_31 = core::CWorldBase::GetInstanceByID(r4)
                                    
                                    if (r0_31 != 0)
                                        void* r0_32 = __dynamic_cast(r0_31, 
                                            _typeinfo_for_core::CInstance, 
                                            _typeinfo_for_ascension::CActiveEffectInstance, 0)
                                        
                                        if (r0_32 != 0)
                                            int32_t r5_1 = *(r0_32 + 0x10)
                                            
                                            if (r5_1 != 0)
                                                void* r0_34 = __dynamic_cast(r5_1, 
                                                    _typeinfo_for_core::CInstance, 
                                                    _typeinfo_for_core::CCardInstance, 0)
                                                
                                                if (r0_34 != 0)
                                                label_18b8d8:
                                                    result = zx.d(*(r0_34 + 8))
                                                    var_104_1 = 0
                                                    break
                                                
                                                void* r0_36 = __dynamic_cast(r5_1, 
                                                    _typeinfo_for_core::CInstance, 
                                                    _typeinfo_for_ascension::CConstructInstance, 0)
                                                
                                                if (r0_36 != 0)
                                                    r0_34 = *(r0_36 + 0x10)
                                                
                                                if (r0_36 != 0 && r0_34 != 0)
                                                    goto label_18b8d8
                                                
                                                void* r0_38 = __dynamic_cast(r5_1, 
                                                    _typeinfo_for_core::CInstance, 
                                                    _typeinfo_for_ascension::CCardInPlayInstance, 0)
                                                
                                                if (r0_38 != 0)
                                                    r0_34 = *(r0_38 + 0x10)
                                                    
                                                    if (r0_34 != 0)
                                                        goto label_18b8d8
                                
                                r8_2 += 1
                                r10_1 += 2
                            while (r8_2 s< var_d0)
                            
                            r8_1 = var_100_1
                        
                        ascension::CEvent::~CEvent()
                        
                        if (var_104_1 == 0)
                            break
                        
                        r3_1 = var_f0_2
                        r0_41 = (&var_50)[r3_1]
                    
                    if (r0_41 == 0xa028 || r0_41 == 0xa024)
                        ascension::CWorld* r2_8 = 7
                        
                        if (ascension::CWorld::IsCardInCenterRow(r4) == 0)
                            ascension::CWorld* r0_45 = ascension::CWorld::IsCardInKingdomStack(r4)
                            r2_8 = r0_45
                            
                            if (r0_45 != 0)
                                r2_8 = 6
                        
                        int32_t var_a4_2 = 6
                        int32_t var_a0_2 = 0
                        var_a8 = _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
                        int32_t var_5c_2 = *(s_InterfaceContext + 0xc)
                        int32_t var_58_2 = 0
                        char (* var_54_2)[0x18] = &var_ec
                        ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_a8, r8_1, 
                            r2_8)
                        ascension::CWorld::HandleQuery(r4)
                        int32_t var_104_2 = 1
                        
                        if (var_d0 s>= 1)
                            int32_t r8_3 = 0
                            int32_t r7_1 = 0x30
                            
                            do
                                if (zx.d(var_ec[r8_3 + 0x20]) == 1)
                                    *(&var_ec + r7_1)
                                    int32_t r0_54 = core::CWorldBase::GetInstanceByID(r4)
                                    
                                    if (r0_54 != 0)
                                        void* r0_55 = __dynamic_cast(r0_54, 
                                            _typeinfo_for_core::CInstance, 
                                            _typeinfo_for_ascension::CActiveEffectInstance, 0)
                                        
                                        if (r0_55 != 0)
                                            int32_t r5_2 = *(r0_55 + 0x10)
                                            
                                            if (r5_2 != 0)
                                                void* r0_57 = __dynamic_cast(r5_2, 
                                                    _typeinfo_for_core::CInstance, 
                                                    _typeinfo_for_core::CCardInstance, 0)
                                                
                                                if (r0_57 != 0)
                                                label_18bc10:
                                                    result = zx.d(*(r0_57 + 8))
                                                    var_104_2 = 0
                                                    break
                                                
                                                void* r0_59 = __dynamic_cast(r5_2, 
                                                    _typeinfo_for_core::CInstance, 
                                                    _typeinfo_for_ascension::CConstructInstance, 0)
                                                
                                                if (r0_59 != 0)
                                                    r0_57 = *(r0_59 + 0x10)
                                                
                                                if (r0_59 != 0 && r0_57 != 0)
                                                    goto label_18bc10
                                                
                                                void* r0_61 = __dynamic_cast(r5_2, 
                                                    _typeinfo_for_core::CInstance, 
                                                    _typeinfo_for_ascension::CCardInPlayInstance, 0)
                                                
                                                if (r0_61 != 0)
                                                    r0_57 = *(r0_61 + 0x10)
                                                    
                                                    if (r0_57 != 0)
                                                        goto label_18bc10
                                
                                r8_3 += 1
                                r7_1 += 2
                            while (r8_3 s< var_d0)
                            
                            r8_1 = var_100_1
                        
                        ascension::CEvent::~CEvent()
                        
                        if (var_104_2 == 0)
                            break
                        
                        r3_1 = var_f0_2
                        r0_41 = (&var_50)[r3_1]
                    
                    if ((r0_41 | 4) == 0xa026)
                        ascension::CWorld* r2_13 = 7
                        
                        if (ascension::CWorld::IsCardInCenterRow(r4) == 0)
                            ascension::CWorld* r0_69 = ascension::CWorld::IsCardInKingdomStack(r4)
                            r2_13 = r0_69
                            
                            if (r0_69 != 0)
                                r2_13 = 6
                        
                        int32_t var_a4_3 = 6
                        int32_t var_a0_3 = 0
                        var_a8 = _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
                        int32_t var_5c_3 = *(s_InterfaceContext + 0xc)
                        int32_t var_58_3 = 0
                        char (* var_54_3)[0x18] = &var_ec
                        ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_a8, r8_1, 
                            r2_13)
                        ascension::CWorld::HandleQuery(r4)
                        int32_t var_104_3 = 1
                        
                        if (var_d0 s>= 1)
                            int32_t r8_4 = 0
                            int32_t r7_2 = 0x30
                            
                            do
                                if (zx.d(var_ec[r8_4 + 0x20]) == 2)
                                    *(&var_ec + r7_2)
                                    int32_t r0_78 = core::CWorldBase::GetInstanceByID(r4)
                                    
                                    if (r0_78 != 0)
                                        void* r0_79 = __dynamic_cast(r0_78, 
                                            _typeinfo_for_core::CInstance, 
                                            _typeinfo_for_ascension::CActiveEffectInstance, 0)
                                        
                                        if (r0_79 != 0)
                                            int32_t r5_3 = *(r0_79 + 0x10)
                                            
                                            if (r5_3 != 0)
                                                void* r0_81 = __dynamic_cast(r5_3, 
                                                    _typeinfo_for_core::CInstance, 
                                                    _typeinfo_for_core::CCardInstance, 0)
                                                
                                                if (r0_81 != 0)
                                                label_18bdc0:
                                                    result = zx.d(*(r0_81 + 8))
                                                    var_104_3 = 0
                                                    break
                                                
                                                void* r0_83 = __dynamic_cast(r5_3, 
                                                    _typeinfo_for_core::CInstance, 
                                                    _typeinfo_for_ascension::CConstructInstance, 0)
                                                
                                                if (r0_83 != 0)
                                                    r0_81 = *(r0_83 + 0x10)
                                                
                                                if (r0_83 != 0 && r0_81 != 0)
                                                    goto label_18bdc0
                                                
                                                void* r0_85 = __dynamic_cast(r5_3, 
                                                    _typeinfo_for_core::CInstance, 
                                                    _typeinfo_for_ascension::CCardInPlayInstance, 0)
                                                
                                                if (r0_85 != 0)
                                                    r0_81 = *(r0_85 + 0x10)
                                                    
                                                    if (r0_81 != 0)
                                                        goto label_18bdc0
                                
                                r8_4 += 1
                                r7_2 += 2
                            while (r8_4 s< var_d0)
                            
                            r8_1 = var_100_1
                        
                        ascension::CEvent::~CEvent()
                        r3_1 = var_f0_2
                        
                        if (var_104_3 == 0)
                            break
                    
                    r3_1 += 1
                    
                    if (r3_1 s>= r0_9)
                        goto label_18c1c8
            case 0xa022, 0xa026
                if (r0_9 s< 1)
                    goto label_18c1c8
                
                int32_t r0_15 = 0
                
                while (true)
                    int32_t r3_2 = (&var_50)[r0_15]
                    
                    if (r3_2 == 0xa028)
                        break
                    
                    if (r3_2 == 0xa024)
                        break
                    
                    r0_15 += 1
                    
                    if (r0_15 s>= r0_9)
                        goto label_18c1c8
                
                ascension::CWorld* r2_18 = 7
                
                if (ascension::CWorld::IsCardInCenterRow(r4) == 0)
                    ascension::CWorld* r0_93 = ascension::CWorld::IsCardInKingdomStack(r4)
                    r2_18 = r0_93
                    
                    if (r0_93 != 0)
                        r2_18 = 6
                
                int32_t var_a4_4 = 6
                int32_t var_a0_4 = 0
                var_a8 = _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
                int32_t var_58_4 = 0
                int32_t var_5c_4 = *(s_InterfaceContext + 0xc)
                char (* var_54_4)[0x18] = &var_ec
                ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_a8, r8_1, r2_18)
                ascension::CWorld::HandleQuery(r4)
                int32_t r5_4 = 1
                
                if (var_d0 s>= 1)
                    int32_t r10_2 = 0
                    int32_t r9_2 = 0x30
                    
                    while (true)
                        if (zx.d(var_ec[r10_2 + 0x20]) == 1)
                            *(&var_ec + r9_2)
                            int32_t r0_101 = core::CWorldBase::GetInstanceByID(r4)
                            
                            if (r0_101 != 0)
                                void* r0_102 = __dynamic_cast(r0_101, 
                                    _typeinfo_for_core::CInstance, 
                                    _typeinfo_for_ascension::CActiveEffectInstance, 0)
                                
                                if (r0_102 != 0)
                                    int32_t r5_5 = *(r0_102 + 0x10)
                                    
                                    if (r5_5 != 0)
                                        void* r0_104 = __dynamic_cast(r5_5, 
                                            _typeinfo_for_core::CInstance, 
                                            _typeinfo_for_core::CCardInstance, 0)
                                        
                                        if (r0_104 != 0)
                                        label_18c1f0:
                                            r5_4 = 0
                                            result = zx.d(*(r0_104 + 8))
                                            break
                                        
                                        void* r0_106 = __dynamic_cast(r5_5, 
                                            _typeinfo_for_core::CInstance, 
                                            _typeinfo_for_ascension::CConstructInstance, 0)
                                        
                                        if (r0_106 != 0)
                                            r0_104 = *(r0_106 + 0x10)
                                            
                                            if (r0_104 != 0)
                                                goto label_18c1f0
                        
                        r10_2 += 1
                        r9_2 += 2
                        
                        if (r10_2 s>= var_d0)
                            r5_4 = 1
                            break
                
                ascension::CEvent::~CEvent()
                
                if (r5_4 != 0)
                    goto label_18c1c8
            case 0xa023, 0xa024, 0xa027, 0xa028, 0xa029, 0xa02a, 0xa02b, 0xa02c, 0xa02e, 0xa02f, 
                    0xa030, 0xa031, 0xa032, 0xa033, 0xa034, 0xa035, 0xa036, 0xa037, 0xa038, 0xa039, 
                    0xa03a, 0xa03b, 0xa03c, 0xa03d, 0xa03e, 0xa03f, 0xa041
                goto label_18c1c8
            case 0xa040, 0xa042
                if (r0_9 s< 1)
                    goto label_18c1c8
                
                int32_t r9_1 = 0
                
                while (true)
                    int32_t r0_128 = (&var_50)[r9_1]
                    
                    if (r0_128 - 0xa043 u<= 1)
                        ascension::CWorld::IsCardInCenterRow(r4) == 0
                            && ascension::CWorld::IsCardInKingdomStack(r4) == 0
                        int32_t var_a4_5 = 8
                        int32_t var_a0_5 = 0
                        var_a8 = _vtable_for_ascension::CEventQueryCardDefeatAttributes + 8
                        int32_t var_5c_5 = *(s_InterfaceContext + 0xc)
                        int32_t var_58_5 = 0
                        char (* var_54_5)[0x18] = &var_ec
                        ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_a8, r8_1)
                        ascension::CWorld::HandleQuery(r4)
                        int32_t var_d4
                        int32_t r6_2
                        
                        if (var_d4 s< 1)
                        label_18c0f4:
                            r6_2 = 1
                        else
                            int32_t r5_6 = 0
                            int32_t r10_3 = 0x24
                            
                            while (true)
                                if (zx.d(var_ec[r5_6 + 0x1c]) == 3)
                                    *(&var_ec + r10_3)
                                    int32_t r0_121 = core::CWorldBase::GetInstanceByID(r4)
                                    
                                    if (r0_121 != 0)
                                        void* r0_122 = __dynamic_cast(r0_121, 
                                            _typeinfo_for_core::CInstance, 
                                            _typeinfo_for_ascension::CActiveEffectInstance, 0)
                                        
                                        if (r0_122 != 0)
                                            int32_t r8_5 = *(r0_122 + 0x10)
                                            
                                            if (r8_5 != 0)
                                                void* r0_124 = __dynamic_cast(r8_5, 
                                                    _typeinfo_for_core::CInstance, 
                                                    _typeinfo_for_core::CCardInstance, 0)
                                                
                                                if (r0_124 != 0)
                                                label_18bf70:
                                                    r6_2 = 0
                                                    result = zx.d(*(r0_124 + 8))
                                                    r8_1 = var_100_1
                                                    break
                                                
                                                void* r0_126 = __dynamic_cast(r8_5, 
                                                    _typeinfo_for_core::CInstance, 
                                                    _typeinfo_for_ascension::CCardInPlayInstance, 0)
                                                
                                                if (r0_126 != 0)
                                                    r0_124 = *(r0_126 + 0x10)
                                                    
                                                    if (r0_124 != 0)
                                                        goto label_18bf70
                                
                                r5_6 += 1
                                r10_3 += 2
                                
                                if (r5_6 s>= var_d4)
                                    r8_1 = var_100_1
                                    goto label_18c0f4
                        
                        ascension::CEvent::~CEvent()
                        
                        if (r6_2 == 0)
                            break
                        
                        r0_128 = (&var_50)[r9_1]
                    
                    if (r0_128 - 0xa047 u<= 1)
                        void* r7_3 = *(s_InterfaceContext + 0xc)
                        
                        if (*(r7_3 + 0xa8) s>= 1)
                            int32_t* r6_3 = *(r7_3 + 0x54)
                            
                            if (r6_3 != *(r7_3 + 0x58))
                                while (true)
                                    int32_t* r5_7 = *r6_3
                                    
                                    if (strcasecmp((*(*r5_7 + 0xc))(r5_7), "Cell Block E") == 0)
                                        void* r0_137 = r5_7[4]
                                        
                                        if (r0_137 != 0)
                                            result_1 = zx.d(*(r0_137 + 8))
                                            break
                                    
                                    r6_3 = &r6_3[1]
                                    
                                    if (r6_3 == *(r7_3 + 0x58))
                                        goto label_18c194
                                
                                goto label_18c1cc
                    
                label_18c194:
                    r9_1 += 1
                    
                    if (r9_1 s>= r0_9)
                        goto label_18c1c8
    else
    label_18c1c8:
        result_1 = 0
    label_18c1cc:
        result = result_1

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
